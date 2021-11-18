package com.froztisoftware.icebergfitness.util.models

class User constructor(){

    var uid: Int = 0
    var first: String = ""
    var last: String = ""
    var height: Float = 0.0f
    var heightUnits: String = ""
    var age: Int = 0
    var weight: Float = 0.0f
    var weightUnits: String = ""

    constructor(
        uid: Int,
        first: String,
        last: String,
        height: Float,
        heightUnits: String,
        age: Int,
        weight: Float,
        weightUnits: String,
    ) : this() {
        this.uid = uid
        this.first = first
        this.last = last
        this.height = height
        this.heightUnits = heightUnits
        this.age = age
        this.weight = weight
        this.weightUnits = weightUnits
    }

    constructor(
        first: String,
        last: String,
        height: Float,
        heightUnits: String,
        age: Int,
        weight: Float,
        weightUnits: String,
    ) : this() {
        this.first = first
        this.last = last
        this.height = height
        this.heightUnits = heightUnits
        this.age = age
        this.weight = weight
        this.weightUnits = weightUnits
    }
}