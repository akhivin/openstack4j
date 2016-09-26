package org.openstack4j.openstack.murano.v1.internal;

import org.openstack4j.api.appcatalog.v1.AppCatalogEnvironmentService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.openstack.internal.BaseOpenStackService;
import org.openstack4j.openstack.murano.v1.domain.EnvironmentDeployment;
import org.openstack4j.openstack.murano.v1.domain.MuranoEnvironment;

import java.util.List;

/**
 * Created by kh on 9/21/16.
 */
public class AppCatalogEnvironmentServiceImpl
        extends BaseOpenStackService
        implements AppCatalogEnvironmentService {

    @Override
    public List<? extends MuranoEnvironment> list() {
        return get(MuranoEnvironment.MuranoEnvironments.class, uri("/environments")).execute().getList();
    }

    @Override
    public ActionResponse create(String name) {
        return null;
    }

    @Override
    public ActionResponse delete(String id) {
        return null;
    }

    @Override
    public ActionResponse rename(String id) {
        return null;
    }

    @Override
    public List<? extends EnvironmentDeployment> deployments() {
        return null;
    }
}
