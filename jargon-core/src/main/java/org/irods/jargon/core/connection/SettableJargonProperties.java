/**
 * 
 */
package org.irods.jargon.core.connection;

import org.irods.jargon.core.exception.JargonException;

/**
 * Implementation of the <code>JargonProperties</code> interface that is sutable
 * for user-definition and injection into the <code>IRODSession</code>.
 * Typcially, properties that control Jargon are pulled from a default
 * jargon.properties file. This class would allow, for example, the wiring of
 * property opttions via Spring through various setters.
 * <p/>
 * Some of these properties serve as defaults that may be overridden in the
 * various methods by the setting of parameters, such as
 * <code>TransferOptions</code>
 * 
 * @author Mike Conway - DICE (www.irods.org)
 * 
 */
public class SettableJargonProperties implements JargonProperties {

	// FIXME: get defaults from prop and allow overrides

	private boolean useParallelTransfer = true;
	private int maxParallelThreads = 4;
	private long parallelThreadsLengthThreshold = 33554432;
	private int maxFilesAndDirsQueryMax = 5000;
	private boolean useTransferThreadsPool = false;
	private int transferThreadCorePoolSize = 0;
	private int transferThreadMaxPoolSize = 16;
	private int transferThreadPoolTimeoutMillis = 60000;
	private boolean allowPutGetResourceRedirects = false;
	private boolean computeChecksumAfterTransfer = false;
	private boolean computeAndVerifyChecksumAfterTransfer = false;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon.core.connection.JargonProperties#
	 * getParallelThreadsLengthThreshold()
	 */
	@Override
	public long getParallelThreadsLengthThreshold() throws JargonException {
		return parallelThreadsLengthThreshold;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.irods.jargon.core.connection.JargonProperites#isUseParallelTransfer()
	 */
	@Override
	public boolean isUseParallelTransfer() throws JargonException {
		return useParallelTransfer;
	}

	public void setUseParallelTransfer(final boolean useParallelTransfer) {
		this.useParallelTransfer = useParallelTransfer;
	}

	public void setMaxParallelThreads(final int maxParallelThreads) {
		this.maxParallelThreads = maxParallelThreads;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.irods.jargon.core.connection.JargonProperites#getMaxParallelThreads()
	 */
	@Override
	public int getMaxParallelThreads() throws JargonException {
		return maxParallelThreads;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.irods.jargon.core.connection.JargonProperties#getMaxFilesAndDirsQueryMax
	 * ()
	 */
	@Override
	public int getMaxFilesAndDirsQueryMax() throws JargonException {
		return maxFilesAndDirsQueryMax;
	}

	@Override
	public boolean isUseTransferThreadsPool() throws JargonException {
		return useTransferThreadsPool;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon.core.connection.JargonProperties#
	 * getTransferThreadCorePoolSize()
	 */
	@Override
	public int getTransferThreadCorePoolSize() throws JargonException {
		return transferThreadCorePoolSize;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon.core.connection.JargonProperties#
	 * getTransferThreadMaxPoolSize()
	 */
	@Override
	public int getTransferThreadMaxPoolSize() throws JargonException {
		return transferThreadMaxPoolSize;
	}

	@Override
	public int getTransferThreadPoolTimeoutMillis() throws JargonException {
		return transferThreadPoolTimeoutMillis;
	}

	/**
	 * @param parallelThreadsLengthThreshold
	 *            the parallelThreadsLengthThreshold to set
	 */
	public void setParallelThreadsLengthThreshold(
			final long parallelThreadsLengthThreshold) {
		this.parallelThreadsLengthThreshold = parallelThreadsLengthThreshold;
	}

	/**
	 * @param maxFilesAndDirsQueryMax
	 *            the maxFilesAndDirsQueryMax to set
	 */
	public void setMaxFilesAndDirsQueryMax(final int maxFilesAndDirsQueryMax) {
		this.maxFilesAndDirsQueryMax = maxFilesAndDirsQueryMax;
	}

	/**
	 * @param useTransferThreadsPool
	 *            the useTransferThreadsPool to set
	 */
	public void setUseTransferThreadsPool(final boolean useTransferThreadsPool) {
		this.useTransferThreadsPool = useTransferThreadsPool;
	}

	/**
	 * @param transferThreadCorePoolSize
	 *            the transferThreadCorePoolSize to set
	 */
	public void setTransferThreadCorePoolSize(
			final int transferThreadCorePoolSize) {
		this.transferThreadCorePoolSize = transferThreadCorePoolSize;
	}

	/**
	 * @param transferThreadMaxPoolSize
	 *            the transferThreadMaxPoolSize to set
	 */
	public void setTransferThreadMaxPoolSize(final int transferThreadMaxPoolSize) {
		this.transferThreadMaxPoolSize = transferThreadMaxPoolSize;
	}

	/**
	 * @param transferThreadPoolTimeoutMillis
	 *            the transferThreadPoolTimeoutMillis to set
	 */
	public void setTransferThreadPoolTimeoutMillis(
			final int transferThreadPoolTimeoutMillis) {
		this.transferThreadPoolTimeoutMillis = transferThreadPoolTimeoutMillis;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon.core.connection.JargonProperties#
	 * isAllowPutGetResourceRedirects()
	 */
	@Override
	public boolean isAllowPutGetResourceRedirects() throws JargonException {
		return allowPutGetResourceRedirects;
	}

	/**
	 * Allow resource redirects to occur
	 * 
	 * @param allowPutGetResourceRedirects
	 *            <code>boolean</code> which allows resource redirects if
	 *            <code>true</code>
	 * @throws JargonException
	 */
	public void setAllowPutGetResourceRedirects(
			final boolean allowPutGetResourceRedirects) throws JargonException {
		this.allowPutGetResourceRedirects = allowPutGetResourceRedirects;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon.core.connection.JargonProperties#
	 * isComputeChecksumAfterTransfer()
	 */
	@Override
	public boolean isComputeChecksumAfterTransfer() throws JargonException {
		return computeChecksumAfterTransfer;
	}

	/**
	 * Compute (but do not verify) a checksum after a transfer.
	 * 
	 * @param computeChecksumAfterTransfer
	 *            <code>boolean</code> that will cause a checksum to be computed
	 *            by default if <code>true</code>
	 * @throws JargonException
	 */
	public void setComputeChecksumAfterTransfer(
			final boolean computeChecksumAfterTransfer) throws JargonException {
		this.computeChecksumAfterTransfer = computeChecksumAfterTransfer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon.core.connection.JargonProperties#
	 * isComputeAndVerifyChecksumAfterTransfer()
	 */
	@Override
	public boolean isComputeAndVerifyChecksumAfterTransfer()
			throws JargonException {
		return this.computeAndVerifyChecksumAfterTransfer;
	}

	/**
	 * Compute and verify the file checksum after a put/get transfer
	 * 
	 * @param computeAndVerifyChecksumAfterTransfer
	 *            <code>boolean</code> that causes a checksum validation if set
	 *            to <code>true</code>
	 */
	public void setComputeAndVerifyChecksumAfterTransfer(
			final boolean computeAndVerifyChecksumAfterTransfer) {
		this.computeAndVerifyChecksumAfterTransfer = computeAndVerifyChecksumAfterTransfer;
	}

}
