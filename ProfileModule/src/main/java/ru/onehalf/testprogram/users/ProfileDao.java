package ru.onehalf.testprogram.users;

import org.springframework.transaction.annotation.Transactional;

/**
 * <p/>
 * <p/>
 * Created: 08.10.12 0:02
 * <p/>
 *
 * @author OneHalf
 */
@Transactional
public interface ProfileDao {

    /**
     * Load prifile data by uid
     * @param uid
     * @return
     */
    public Profile loadProfile(Long uid);

    public void saveProfile(Profile profile);
    
    public void insertProfile(Profile profile);
}
