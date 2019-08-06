package com.codeclan.homework.filingsystem.repositories;

import com.codeclan.homework.filingsystem.models.User;
import com.codeclan.homework.filingsystem.models.projections.EmbedFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolders.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
