package com.codeclan.homework.filingsystem.repositories;

import com.codeclan.homework.filingsystem.models.File;
import com.codeclan.homework.filingsystem.models.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
