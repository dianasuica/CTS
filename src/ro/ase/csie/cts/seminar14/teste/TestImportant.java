package ro.ase.csie.cts.seminar14.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.cts.seminar14.teste.categorii.TesteImportante;

@RunWith(Categories.class)
@IncludeCategory({TesteImportante.class})
@SuiteClasses({ TestStudent.class, TestStudent2.class })
public class TestImportant {

}
