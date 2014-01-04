package ru.onehalf.testprogram.web;

/**
 * <p/>
 * <p/>
 * Created: 08.10.12 0:35
 * <p/>
 *
 * @author OneHalf
 */
public class ProfileNotFoundException extends RuntimeException {

    public ProfileNotFoundException(String uid) {
        super("cannot get user by uid=" + uid);
    }
}
