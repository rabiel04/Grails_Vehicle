package org.grails.guides

import groovy.transform.CompileStatic


class BootStrap {

    def init = { servletContext ->

        Make nissan = new Make(name:"Nissan").save()
        Make ford = new Make(name:"Ford").save()

        def titan = new Model(name:"Titan",make:nissan).save()
        def leaf = new Model(name:"Leaf",make:nissan).save()
        def windstar = new Model(name:"Windstar", make :ford).save()

        new Vehicle(name:"Pickup", make :nissan, model:titan,year: 2012).save()
        new Vehicle(name:"Economy",make:nissan,model:leaf,year: 2014).save()
        new Vehicle(name:"Minivan",make:ford,model:windstar,year: 2019).save()
    }
    def destroy = {
    }
}
