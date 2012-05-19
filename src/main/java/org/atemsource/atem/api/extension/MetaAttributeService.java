package org.atemsource.atem.api.extension;

import org.atemsource.atem.api.attribute.relation.SingleAttribute;
import org.atemsource.atem.api.type.EntityType;

// TODO: Auto-generated Javadoc
/**
 * The Interface MetaAttributeService.
 */
public interface MetaAttributeService {

	/**
	 * Adds the single meta attribute.
	 * 
	 * @param <J>
	 *            the generic type
	 * @param name
	 *            the name
	 * @param holderType
	 *            the holder type
	 * @param metaDataType
	 *            the meta data type
	 * @return the single attribute
	 */
	<J> SingleAttribute<J> addSingleMetaAttribute(String name,
			EntityType<?> holderType, EntityType<J> metaDataType);

	/**
	 * Gets the meta attribute.
	 * 
	 * @param <J>
	 *            the generic type
	 * @param name
	 *            the name
	 * @return the meta attribute
	 */
	<J> SingleAttribute<J> getMetaAttribute(String name);

	/**
	 * Gets the meta data.
	 * 
	 * @param name
	 *            the name
	 * @param holder
	 *            the holder
	 * @return the meta data
	 */
	Object getMetaData(String name, Object holder);

}