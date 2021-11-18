package com.froztisoftware.icebergfitness.util.models

class Routine constructor(){

    var uid: Int = 0
    var name: String = ""
    var planID: Int = 0
    var created: Int = 0
    var updated: Int = 0

    constructor(uid: Int, name: String, planID: Int, created: Int, updated: Int) : this() {
        this.uid = uid
        this.name = name
        this.planID = planID
        this.created = created
        this.updated = updated
    }

    constructor(name: String, planID: Int, created: Int, updated: Int) : this() {
        this.name = name
        this.planID = planID
        this.created = created
        this.updated = updated
    }
}