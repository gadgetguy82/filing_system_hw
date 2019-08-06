package com.codeclan.homework.filingsystem.repositories;

import com.codeclan.homework.filingsystem.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
