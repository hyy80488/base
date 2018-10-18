package com.jw.base.framework.core.shell;

import com.jcraft.jsch.SftpProgressMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JwProgressMonitor implements SftpProgressMonitor {

	private static final Logger logger = LoggerFactory.getLogger(JwProgressMonitor.class);

	private long transfered;

	@Override
	public boolean count(long count) {
		transfered = transfered + count;
		logger.debug("Currently transferred total size: " + transfered + " bytes");
		return true;
	}

	@Override
	public void end() {
		logger.debug("Transferring done.");
	}

	@Override
	public void init(int op, String src, String dest, long max) {
		logger.debug("Transferring begin.");
	}

}
