/**
 * 
 */
package org.irods.jargon.conveyor.core;

import org.irods.jargon.transfer.dao.domain.Transfer;
import org.irods.jargon.transfer.dao.domain.TransferAttempt;

/**
 * Service to manage updates to a <code>Transfer</code> as a result of running
 * that transfer. This would include updates to the current attempt, and
 * file-by-file accounting procedures as signaled in the transfer callback
 * process
 * 
 * @author Mike Conway - DICE (www.irods.org)
 * 
 */
public interface TransferAccountingManagementService {

	public TransferAttempt prepareTransferForExecution(Transfer transfer)
			throws ConveyorExecutionException;

}
