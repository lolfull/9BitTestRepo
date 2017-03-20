package facespace

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/" (view:"/loginpage")
        "/login" (view:"/loginpage")
        "/signup" (view: "/signup")
        "/dashboard"(view:"/dashboard")
        "/transaction"(view:"/transaction")
        "/achievements"(view:"/achievements")
        "/settings"(view:"/settings")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
