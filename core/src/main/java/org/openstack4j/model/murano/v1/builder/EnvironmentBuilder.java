package org.openstack4j.model.murano.v1.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.murano.v1.domain.Environment;

/**
 * Created by kh on 9/21/16.
 */
public interface EnvironmentBuilder extends Builder<EnvironmentBuilder, Environment> {

    EnvironmentBuilder id(String id);

    EnvironmentBuilder status(String status);

    EnvironmentBuilder updated(String updated);

    EnvironmentBuilder name(String name);

    EnvironmentBuilder created(String created);

    EnvironmentBuilder tenantId(String tenantId);

    EnvironmentBuilder version(String version);

}
