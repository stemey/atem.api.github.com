package org.atemsource.atem.api.extension;

import org.atemsource.atem.api.attribute.relation.SingleAttribute;
import org.atemsource.atem.api.type.EntityType;
import org.atemsource.atem.spi.EntityTypeCreationContext;

/**
 * MetaAttributeService olffers methods create a meta attribute. A meta
 * attribute is a virtual attribute that attaches metadata to a holder type. An
 * instance of metaAttributeService can be accessed from the dependency
 * container. Usually tere will be more than one instance configured. They are
 * providing different means of persisting the meta data association. The
 * metaattribute is not added to the ist of atributes of the holder. It can be
 * retrieved as an incoming association on the holder type. The target type of
 * that attribute will not necessarily be the meta data type. Rather there is an
 * intermediate type holding references to both the meta data and the holder.
 */
public interface MetaAttributeService {

	/**
	 * Adds the single meta attribute.
	 * 
	 * @param <J>
	 *            the type of the metadata
	 * @param name
	 *            the name of the meta attribute
	 * @param holderType
	 *            the type that the metadata is applied to
	 * @param metaDataType
	 *            the meta data type
	 * @return the single attribute
	 */
	<J> SingleAttribute<J> addSingleMetaAttribute(String name,
			EntityType<?> holderType, EntityType<J> metaDataType);


}
