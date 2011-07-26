package org.irods.jargon.core.pub;

import java.io.InputStream;
import java.io.OutputStream;

import org.irods.jargon.core.exception.JargonException;
import org.irods.jargon.core.pub.io.IRODSFile;

/**
 * Interface for an access object that helps with copying streams or byte arrays
 * to and from iRODS files.
 * <p/>
 * This is a new service, so methods will fill in as they are identified.
 * 
 * @author Mike Conway - DICE (www.irods.org)
 */
public interface Stream2StreamAO {

	/**
	 * Given the set of bytes, copy them to the given target file in iRODS.
	 * 
	 * @param bytesToStream
	 *            <code>byte[]</code> with the bytes to copy
	 * @param irodsTargetFile
	 *            {@link IRODSFile} that will be written to
	 * @throws JargonException
	 */
	void streamBytesToIRODSFile(final byte[] bytesToStream,
			final IRODSFile irodsTargetFile) throws JargonException;

	/**
	 * Stream the file contents to a byte array. Note that this method is
	 * suitable for small data sizes, but since it uses memory, large files may
	 * cause memory problems.
	 * <p/>
	 * This particular method is used internally for object de-serialization
	 * when stored as iRODS files.
	 * 
	 * @param irodsFile
	 *            {@link IRODSFile} that will be the source of the byte data
	 * @return <code>byte[]</code> array representing the file contents
	 * @throws JargonException
	 */
	byte[] streamFileToByte(IRODSFile irodsFile) throws JargonException;

	/**
	 * Stream the <code>InputStream</code> to the <code>OutputStream</code>
	 * 
	 * @param inputStream
	 *            <code>InputStream</code> to stream from
	 * @param outputStream
	 *            <code>OutputStream</code> to stream to
	 * @throws JargonException
	 */
	void streamToStreamCopy(InputStream inputStream, OutputStream outputStream)
			throws JargonException;

}