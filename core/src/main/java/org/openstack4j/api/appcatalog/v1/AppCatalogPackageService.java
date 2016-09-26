package org.openstack4j.api.appcatalog.v1;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.common.DLPayload;

/**
 * Created by kh on 9/21/16.
 */
public interface AppCatalogPackageService extends RestService {

    ActionResponse importPackage(String name);
    ActionResponse list(String name);
    ActionResponse delete(String name);
    DLPayload download(String name);

}
