package com.github.fnsousa.infra;

import com.github.fnsousa.application.UserDsRequestModel;
import com.github.fnsousa.application.UserRegisterDsGateway;

public class JpaUser implements UserRegisterDsGateway {

    final JpaUserRepository repository;

    public JpaUser(JpaUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean existsByName(String name) {
        return repository.existsById(name);
    }

    @Override
    public void save(UserDsRequestModel requestModel) {
        UserDataMapper accountDataMapper = new UserDataMapper(requestModel.getName(), requestModel.getPassword(), requestModel.getCreationTime());
        repository.save(accountDataMapper);
    }
}