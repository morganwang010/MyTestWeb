##The First Spring MVC Example##

####2014-10-30####
add the bean validation.
and the mainly control is 

public String regist(@ModelAttribute(value = "loginForm") @Valid LoginForm loginForm, BindingResult result, Model model)

	{
		return "/login";
	}

####2014-10-29####
the first exmaple about spring mvc.
Make the spring found the annotation auto.

Only finish the web.xml app-servlet.xml 

when you visit the website, it's default url is /hello,

and when you requre the /hello, it will jump to the /login  viewer.

so, the login viewer is found by spring automatically