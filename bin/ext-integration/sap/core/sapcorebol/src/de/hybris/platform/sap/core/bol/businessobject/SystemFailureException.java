/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 * 
 */
package de.hybris.platform.sap.core.bol.businessobject;

import de.hybris.platform.sap.core.common.message.Message;
import de.hybris.platform.sap.core.common.message.MessageList;


/**
 * System failure of underlying backend system.
 */
public class SystemFailureException extends CommunicationException
{

	private static final long serialVersionUID = -792263602801264272L;

	/**
	 * Constructor.
	 * 
	 * @param msg
	 *           Message for the Exception
	 * @param msgList
	 *           List of the messages added to the exception
	 */
	public SystemFailureException(final String msg, final MessageList msgList)
	{
		super(msg, msgList);
	}

	/**
	 * Constructor.
	 * 
	 * @param msg
	 *           Message for the Exception
	 * @param message
	 *           message added to the exception
	 */
	public SystemFailureException(final String msg, final Message message)
	{
		super(msg, message);
	}

	/**
	 * Constructor.
	 * 
	 * @param msg
	 *           Message for the Exception
	 */
	public SystemFailureException(final String msg)
	{
		super(msg);
	}

	/**
	 * Constructor.
	 */
	public SystemFailureException()
	{
		super();
	}

	/**
	 * Standard constructor for SystemFailureException using a simple message text. <br>
	 * 
	 * @param msg
	 *           message text
	 * @param message
	 *           message object.
	 * @param rootCause
	 *           exception which causes the exception
	 */
	public SystemFailureException(final String msg, final Message message, final Throwable rootCause)
	{
		super(msg, message, rootCause);
	}

}
