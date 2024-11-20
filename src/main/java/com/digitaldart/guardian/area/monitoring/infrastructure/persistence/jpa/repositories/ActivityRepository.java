package com.digitaldart.guardian.area.monitoring.infrastructure.persistence.jpa.repositories;

import com.digitaldart.guardian.area.monitoring.domain.model.aggregates.Activity;
import com.digitaldart.guardian.area.monitoring.domain.model.valueobjects.ActivityType;
import com.digitaldart.guardian.area.monitoring.domain.model.valueobjects.GuardianAreaDeviceRecordId;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
  List<Activity> findAllByGuardianAreaDeviceRecordId(GuardianAreaDeviceRecordId guardianAreaDeviceRecordId);
  List<Activity> findAllByGuardianAreaDeviceRecordIdAndActivityType(GuardianAreaDeviceRecordId guardianAreaDeviceRecordId, ActivityType activityType);
}
