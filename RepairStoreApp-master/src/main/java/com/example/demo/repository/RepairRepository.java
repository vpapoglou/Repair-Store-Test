package com.example.demo.repository;
import com.example.demo.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Repair;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface RepairRepository extends JpaRepository<Repair,Long>{

    Repair findByRepairID(Long repairID);
    Repair save(Repair repair);
    List<Repair> findAll();
    List<Repair> findRepairByOwnerId(Long id);
    List<Repair> findTop10ByFinishDayOfRepairAfter(LocalDateTime date);
    @Query(value = "SELECT r.* FROM OWNER u INNER JOIN REPAIRS r ON u.ownerId = r.ownerId WHERE r.registrationDayOfRepair = ?1 OR u.taxRegNum = ?2 OR u.carPlate = ?3", nativeQuery = true)
    List<Repair> findByTaxRegistrationNumberOrCarPlateOrDayOfRepair(LocalDate dayOfRepair, String taxRegistrationNumber, String carPlate);
    void deleteById(Long id);

}
