package com.froztisoftware.icebergfitness.util.models

class Workout constructor() {

    var uid: Int = 0
    var date: String = ""
    var routineID: Int = 0
    var created: Int = 0
    var updated: Int = 0

    constructor(uid: Int, date: String, routineID: Int, created: Int, updated: Int) : this() {
        this.uid = uid
        this.date = date
        this.routineID = routineID
        this.created = created
        this.updated = updated
    }

    constructor(date: String, routineID: Int, created: Int, updated: Int) : this() {
        this.date = date
        this.routineID = routineID
        this.created = created
        this.updated = updated
    }
}