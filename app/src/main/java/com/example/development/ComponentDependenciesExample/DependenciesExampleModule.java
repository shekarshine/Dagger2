package com.example.development.ComponentDependenciesExample;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shekar on 7/10/15.
 */
@Module
public class DependenciesExampleModule {
    @Provides
    String provideName() {
        return "Shekar";
    }
}
