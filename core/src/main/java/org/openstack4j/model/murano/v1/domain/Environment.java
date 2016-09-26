package org.openstack4j.model.murano.v1.domain;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.murano.v1.builder.EnvironmentBuilder;

/**
 * Created by kh on 9/21/16.
 */
public interface Environment extends ModelEntity, Buildable<EnvironmentBuilder> {
    String getId();
    String getStatus();
    String getUpdated();
    String getName();
    String getCreated();
    String getTenantId();
    String getVersion();
}
