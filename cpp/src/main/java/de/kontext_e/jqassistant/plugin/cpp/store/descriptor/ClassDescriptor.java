package de.kontext_e.jqassistant.plugin.cpp.store.descriptor;

import com.buschmais.jqassistant.plugin.common.api.model.NamedDescriptor;
import com.buschmais.xo.neo4j.api.annotation.Label;

@Label("Class")
public interface ClassDescriptor extends CppDescriptor, NamedDescriptor {
}
