package com.digitaldart.guardian.area.monitoring.domain.model.commands;

import com.digitaldart.guardian.area.monitoring.domain.model.valueobjects.GuardianAreaDeviceRecordId;

public record AssignDeviceCommand(GuardianAreaDeviceRecordId guardianAreaDeviceRecordId, Long userId) {
}
