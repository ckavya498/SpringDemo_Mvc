package org.com.gen;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyFrountController extends AbstractAnnotationConfigDispatcherServletInitializer {
@Override
protected Class<?>[] getRootConfigClasses() {
// TODO Auto-generated method stub
return new Class[] {MVCConfig.class};
}

@Override
protected Class<?>[] getServletConfigClasses() {
// TODO Auto-generated method stub
return null;
}

@Override
protected String[] getServletMappings() {
// TODO Auto-generated method stub
return new String[] {"/"};
}



}