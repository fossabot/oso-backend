package org.oso.core.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.OneToMany

@Entity
data class DeviceType(
    @Column(unique = true)
    val name: String,
    val enabled: Boolean = true
) : BaseEntity() {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "deviceType")
    val devices = mutableSetOf<Device>()
}