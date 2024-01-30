// Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>

updateOptions                   := updateOptions.value.withLatestSnapshots(false)
addSbtPlugin("com.typesafe.play" % "sbt-plugin"         % sys.props("project.version"))
addSbtPlugin("com.typesafe.play" % "sbt-scripted-tools" % sys.props("project.version"))
addSbtPlugin("com.github.sbt"    % "sbt-less"           % "2.0.1")
