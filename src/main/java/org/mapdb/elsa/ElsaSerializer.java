package org.mapdb.elsa;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Elsa serializer and deserializer.
 * It turns object instance into binary form and vice versa.
 *
 */
public interface ElsaSerializer {

    /**
     * Converts object instance into binary form
     *
     * @param output output into which binary data will be written while object is serialized
     * @param obj object instance to be serialized
     * @throws IOException an exception from underlying stream
     */
    void serialize(DataOutput output, Object obj) throws IOException;

    /**
     * Reads binary data from input and converts them into object instances.
     *
     * @param input input to read data from
     * @return deserialized object
     * @throws IOException an exception from underlying stream
     */
    Object deserialize(DataInput input) throws IOException;

    /**
     * Deep binary clone. Serialize object into binary form, and then use data to deserialize it.
     * Returned object should be equal to original, but is completely different instance.
     *
     * @param obj object instance to be cloned
     * @param <E> type of cloned object
     * @return deep clone
     * @throws IOException an exception from underlying stream
     */
    <E> E clone(E obj) throws IOException;
}
