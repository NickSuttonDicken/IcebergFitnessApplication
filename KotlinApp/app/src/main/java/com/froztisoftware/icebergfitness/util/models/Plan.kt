package com.froztisoftware.icebergfitness.util.models

class Plan constructor(){


    var uid: Int = 0
    var name: String = ""
    var created: Int = 0
    var updated: Int = 0

    constructor(uid: Int, name: String, created: Int, updated: Int) : this() {
        this.uid = uid
        this.name = name
        this.created = created
        this.updated = updated
    }

    constructor(name: String, created: Int, updated: Int) : this() {
        this.name = name
        this.created = created
        this.updated = updated
    }
}