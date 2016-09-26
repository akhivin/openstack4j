package org.openstack4j.openstack.murano.v1.internal;

import org.openstack4j.api.appcatalog.v1.AppCatalogCategoryService;
import org.openstack4j.api.appcatalog.v1.AppCatalogEnvironmentService;
import org.openstack4j.api.appcatalog.v1.AppCatalogPackageService;
import org.openstack4j.api.appcatalog.v1.AppCatalogService;
import org.openstack4j.api.types.ServiceType;
import org.openstack4j.openstack.internal.BaseOpenStackService;

/**
 * Created by kh on 9/21/16.
 */
public class AppCatalogServiceImpl
        extends BaseOpenStackService
        implements AppCatalogService {

    public AppCatalogServiceImpl() {
        super(ServiceType.APP_CATALOG);
    }


    /***
     *  TODO: Use the same pattern as used in the OpenStack4j
     * @return the Application Catalog Service API for environments
     */
    @Override
    public AppCatalogEnvironmentService environments() {
        return new AppCatalogEnvironmentServiceImpl();
    }

    @Override
    public AppCatalogPackageService packages() {
        return null;
    }

    @Override
    public AppCatalogCategoryService categories() {
        return null;
    }
}
