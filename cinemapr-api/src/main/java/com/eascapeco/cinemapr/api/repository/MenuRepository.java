package com.eascapeco.cinemapr.api.repository;

import com.eascapeco.cinemapr.api.model.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
