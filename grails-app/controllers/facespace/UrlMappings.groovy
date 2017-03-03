package facespace

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/" (view:"/loginpage")
        "/signup" (view: "/signup")
        "/dashboard"(view:"/dashboard")
        "/transaction"(view:"/transaction")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
