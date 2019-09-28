package pl.mdemski.services;

import org.springframework.stereotype.Service;
import pl.mdemski.dto.WindowDTO;
import pl.mdemski.model.Window;
import pl.mdemski.repositories.WindowRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class WindowService {

    private WindowRepository windowRepository;

    public WindowService(WindowRepository windowRepository) {
        this.windowRepository = windowRepository;
    }

    public void configureNewWindow(WindowDTO dataWindowDTO){
        Window window = new Window();

    }
}
