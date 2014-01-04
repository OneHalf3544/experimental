package ru.onehalf.testprogram.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;
import ru.onehalf.testprogram.users.Profile;
import ru.onehalf.testprogram.users.ProfileDao;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * <p/>
 * <p/>
 * Created: 08.10.12 0:22
 * <p/>
 *
 * @author OneHalf
 */
public class ProfileArgumentResolver implements WebArgumentResolver {

    @Autowired
    private ProfileDao profileDao;

    private final Executor executor = Executors.newCachedThreadPool();

    @Override
    public Object resolveArgument(MethodParameter methodParameter, NativeWebRequest webRequest) throws Exception {
        if (methodParameter.getParameterType() != Profile.class) {
            return UNRESOLVED;
        }
        boolean required = methodParameter.hasParameterAnnotation(Required.class);
        String uid = webRequest.getParameter("uid");
        if (!required && uid == null) {
            return null;
        }
        if (!uid.matches("\\d+")) {
            throw new ProfileNotFoundException(uid);
        }
        Profile profile = profileDao.loadProfile(Long.parseLong(uid));
        if (required && profile == null) {
            throw new ProfileNotFoundException(uid);
        }
        return profile;
    }

}
