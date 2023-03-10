package org.grails.guides

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Vehicle {

    Integer year
    String name
    Model model
    Make make

    static constraints = {

        name maxSize: 255
        year min: 1900
    }
}

