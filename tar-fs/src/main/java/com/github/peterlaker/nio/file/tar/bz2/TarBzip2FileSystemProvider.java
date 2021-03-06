package com.github.peterlaker.nio.file.tar.bz2;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

import com.github.peterlaker.nio.file.tar.AbstractTarFileSystem;
import com.github.peterlaker.nio.file.tar.AbstractTarFileSystemProvider;

public class TarBzip2FileSystemProvider extends AbstractTarFileSystemProvider {

	@Override
	protected AbstractTarFileSystem newInstance(
			AbstractTarFileSystemProvider provider, Path path,
			Map<String, ?> env) throws IOException {
		return new TarBzip2FileSystem(provider, path, env);
	}

	@Override
	public String getScheme() {
		return "tar.bz2";
	}

}
