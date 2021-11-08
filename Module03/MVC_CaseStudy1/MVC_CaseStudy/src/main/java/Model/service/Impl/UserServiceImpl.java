package Model.service.Impl;

import Model.BEAN.employee.user;
import Model.repository.Impl.UserRepositoryImpl;
import Model.repository.UserRepository;
import Model.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepository userRepository=new UserRepositoryImpl();
    public List<user> findALl() {
        return UserRepository.findALl();
    }
}
