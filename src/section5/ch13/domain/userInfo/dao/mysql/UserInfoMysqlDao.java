package section5.ch13.domain.userInfo.dao.mysql;

import section5.ch13.domain.userInfo.UserInfo;
import section5.ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into MYSQL DB userId = " + userInfo.getUserId());
    }
}
