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
package de.hybris.platform.yb2bacceleratorstorefront.controllers.misc;

import de.hybris.platform.yb2bacceleratorstorefront.controllers.AbstractController;
import de.hybris.platform.yb2bacceleratorstorefront.controllers.ControllerConstants;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Controller for web robots instructions.
 */
@Controller
@Scope("tenant")
public class RobotsController extends AbstractController
{
	@RequestMapping(value = "/robots.txt", method = RequestMethod.GET)
	public String getRobots()
	{
		return ControllerConstants.Views.Pages.Misc.MiscRobotsPage;
	}
}
