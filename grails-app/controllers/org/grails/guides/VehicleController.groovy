package org.grails.guides

import grails.gorm.transactions.Transactional

@SuppressWarnings('LineLength')
@Transactional(readOnly = true)
class VehicleController {

    static namespace = "scaffolding"

    static allowedMethods = [save:'POST',update:'PUT',delete:'DELETE']

   // static scaffold = Vehicle

    def index( Integer max) {

        params.max=Math.min(max?:10,100)
        respond Vehicle.list(parms),Model:[vehicleCount:Vehicle.count()]
    }

    def show(Vehicle vehicle){
        respond vehicle
    }

    @SuppressWarnings(['FactoryMethode´Name','GrailsMAssAssignment'])
    def create(){
        respond new Vehicle(parms)
    }

    @Transactional()
    def save(Vehicle vehicle){

            

    }
}
