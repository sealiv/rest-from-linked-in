package com.example.ec.repo;

import com.example.ec.domain.Difficulty;
import com.example.ec.domain.Region;
import com.example.ec.domain.Tour;
import com.example.ec.domain.TourPackage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * Tour Package Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

    /**
     * Find Tour Package by name.
     *
     * @param name name of the package
     * @return Optional of TourPackage
     */
    Optional<TourPackage> findByName(String name);

    /*@Query("Select t from Tour t where t.tourPackage.code = ?1 and t.difficulty = ?2 and t.region = ?3 and t.price <= ?4")
    List<Tour> lookupTour(String code, Difficulty difficulty, Region region, Integer maxPrice);

    //The same as lookupTour()
    List<Tour> findByTourPackageCodeAndDifficultyAndRegionAndPriceLessThan
            (String code, Difficulty difficulty, Region region, Integer maxPrice);*/
}