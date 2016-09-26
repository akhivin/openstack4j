package org.openstack4j.api.appcatalog.v1;


import org.openstack4j.common.RestService;

/**
 */
public interface AppCatalogService extends RestService {

    AppCatalogEnvironmentService environments();

    AppCatalogPackageService packages();

    AppCatalogCategoryService categories();

}
