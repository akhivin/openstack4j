package org.openstack4j.openstack.murano.v1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.model.murano.v1.builder.EnvironmentBuilder;
import org.openstack4j.model.murano.v1.domain.Environment;
import org.openstack4j.openstack.common.ListResult;
import org.openstack4j.openstack.identity.v3.domain.KeystoneDomain;

import java.util.List;

/**
 * Created by kh on 9/21/16.
 */
public class MuranoEnvironment implements Environment {

    private static final long serialVersionUID = 1L;

    @JsonProperty
    private String id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String status;

    @JsonProperty
    private String updated;

    @JsonProperty
    private String created;

    @JsonProperty
    private String version;

    @JsonProperty
    private String tenantId;

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public String getUpdated() {
        return this.updated;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getCreated() {
        return this.created;
    }

    @Override
    public String getTenantId() {
        return this.tenantId;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    @Override
    public EnvironmentBuilder toBuilder() {
        return new MuranoEnvironmentConcreteBuilder(this);
    }

    public static class MuranoEnvironmentConcreteBuilder implements  EnvironmentBuilder{

        private MuranoEnvironment model;

        public MuranoEnvironmentConcreteBuilder() {
            this(new MuranoEnvironment());
        }

        public MuranoEnvironmentConcreteBuilder(MuranoEnvironment model) {
            this.model = model;
        }


        @Override
        public EnvironmentBuilder id(String id) {
            this.model.id = id;
            return this;
        }

        @Override
        public EnvironmentBuilder status(String status) {
            this.model.status = status;
            return this;
        }

        @Override
        public EnvironmentBuilder updated(String updated) {
            this.model.updated = updated;
            return this;
        }

        @Override
        public EnvironmentBuilder name(String name) {
            this.model.name = name;
            return this;
        }

        @Override
        public EnvironmentBuilder created(String created) {
            this.model.created = created;
            return this;
        }

        @Override
        public EnvironmentBuilder tenantId(String tenantId) {
            this.model.tenantId = tenantId;
            return this;
        }

        @Override
        public EnvironmentBuilder version(String version) {
            this.model.version= version;
            return this;
        }

        @Override
        public Environment build() {
            return this.model;
        }

        @Override
        public EnvironmentBuilder from(Environment in) {
            if (in != null) {
                this.model = (MuranoEnvironment) in;
            }
            return this;
        }
    }


    public static class MuranoEnvironments extends ListResult<MuranoEnvironment> {

        private static final long serialVersionUID = 1L;

        @JsonProperty("environments")
        protected List<MuranoEnvironment> list;

        @Override
        protected List<MuranoEnvironment> value() {
            return list;
        }
    }
}
