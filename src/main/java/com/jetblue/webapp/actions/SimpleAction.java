package com.jetblue.webapp.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.jetblue.webapp.beans.SimpleFormBean;

public class SimpleAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		SimpleFormBean bean = (SimpleFormBean)form;
		System.out.println(bean.getName());
		return mapping.findForward("success");
	}
	
	

}
