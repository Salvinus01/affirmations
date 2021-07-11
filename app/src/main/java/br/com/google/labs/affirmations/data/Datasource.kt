package br.com.google.labs.affirmations.data

import br.com.google.labs.affirmations.R
import br.com.google.labs.affirmations.model.Affirmation
import java.nio.file.attribute.AclFileAttributeView

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmations1),
            Affirmation(R.string.affirmations2), Affirmation(R.string.affirmations3),
            Affirmation(R.string.affirmations4), Affirmation(R.string.affirmations5),
            Affirmation(R.string.affirmations6), Affirmation(R.string.affirmations7),
            Affirmation(R.string.affirmations8), Affirmation(R.string.affirmations9),
            Affirmation(R.string.affirmations10)
        )
    }
}