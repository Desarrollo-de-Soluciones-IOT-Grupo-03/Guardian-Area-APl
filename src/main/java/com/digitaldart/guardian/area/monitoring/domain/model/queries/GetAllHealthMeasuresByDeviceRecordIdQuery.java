package com.digitaldart.guardian.area.monitoring.domain.model.queries;

import com.digitaldart.guardian.area.monitoring.domain.model.valueobjects.GuardianAreaDeviceRecordId;

public record GetAllHealthMeasuresByDeviceRecordIdQuery(GuardianAreaDeviceRecordId guardianAreaDeviceRecordId) {
}
