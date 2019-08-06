package com.codeclan.homework.filingsystem.repositories;

import com.codeclan.homework.filingsystem.models.Folder;
import com.codeclan.homework.filingsystem.models.projections.EmbedFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFiles.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
