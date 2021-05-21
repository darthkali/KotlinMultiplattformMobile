package com.example.models

data class Dessert(
    override val id: String,
    var name: String,
    var description: String,
    var imageUrl: String
) : Model


data class DessertInput(
    var name: String,
    var description: String,
    var imageUrl: String
)