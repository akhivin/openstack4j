package org.openstack4j.api.appcatalog.v1;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.murano.v1.domain.Environment;
import org.openstack4j.openstack.murano.v1.domain.EnvironmentDeployment;

import java.util.List;

/**
 * Created by kh on 9/21/16.
 */
public interface AppCatalogEnvironmentService extends RestService {

    List<? extends Environment> list();

    ActionResponse create(String name);

    ActionResponse delete(String id);

    ActionResponse rename(String id);

    List<? extends EnvironmentDeployment> deployments();

}
