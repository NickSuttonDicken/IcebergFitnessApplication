package com.froztisoftware.icebergfitness.util.models

class ExerciseSet constructor(){

    var uid: Int = 0
    var order: Int = 0
    var weight: Float = 0.0f
    var weightUnits: String = ""
    var reps: Int = 0
    var distance: Float = 0.0f
    var distanceUnits: String = ""
    var time: String = ""
    var exerciseID: Int = 0
    var workoutID: Int = 0
    var created: String = ""
    var updated: String = ""
    var oneRepMax: Float = 0.0f
    var volume: Float = 0.0f

    constructor(
        uid: Int,
        order: Int,
        weight: Float,
        weightUnits: String,
        reps: Int,
        distance: Float,
        distanceUnits: String,
        time: String,
        exerciseID: Int,
        workoutID: Int,
        created: String,
        updated: String,
        oneRepMax: Float,
        volume: Float,
    ) : this() {
        this.uid = uid
        this.order = order
        this.weight = weight
        this.weightUnits = weightUnits
        this.reps = reps
        this.distance = distance
        this.distanceUnits = distanceUnits
        this.time = time
        this.exerciseID = exerciseID
        this.workoutID = workoutID
        this.created = created
        this.updated = updated
        this.oneRepMax = oneRepMax
        this.volume = volume
    }

    constructor(
        order: Int,
        weight: Float,
        weightUnits: String,
        reps: Int,
        distance: Float,
        distanceUnits: String,
        time: String,
        exerciseID: Int,
        workoutID: Int,
        created: String,
        updated: String,
        oneRepMax: Float,
        volume: Float,
    ) : this() {
        this.order = order
        this.weight = weight
        this.weightUnits = weightUnits
        this.reps = reps
        this.distance = distance
        this.distanceUnits = distanceUnits
        this.time = time
        this.exerciseID = exerciseID
        this.workoutID = workoutID
        this.created = created
        this.updated = updated
        this.oneRepMax = oneRepMax
        this.volume = volume
    }
}