package org.openstack4j.api.appcatalog.v1;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;

/**
 * Created by kh on 9/21/16.
 */
public interface AppCatalogCategoryService extends RestService {
    ActionResponse get(String id);
    ActionResponse list();
    ActionResponse delete(String id);
}
