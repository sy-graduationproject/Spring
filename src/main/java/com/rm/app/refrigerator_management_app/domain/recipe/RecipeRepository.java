package com.rm.app.refrigerator_management_app.domain.recipe;

import com.rm.app.refrigerator_management_app.domain.recipe.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Entity 클래스, PK 타입>을 상속하면 기본적인 CRUD 메소드가 자동으로 생성된다.
// Entity 클래스와 같은 패키지에 위치해야한다.
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
